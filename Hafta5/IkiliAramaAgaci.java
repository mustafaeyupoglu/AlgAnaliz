/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikiliaramaagaci;

/**
 *
 * @author mustafa
 */
public class IkiliAramaAgaci {
class Node{
	int data;
        int depth;
	Node left;
	Node right;	
	public Node(int data){
		this.data = data;
                
		left = null;
		right = null;
	}
        public void setDepth(int d)
        {
            this.depth=d;
        }
}
	public static  Node root;
	public IkiliAramaAgaci(){
		this.root = null;
	}
	
	public boolean find(int id){
		Node current = root;
		while(current!=null){
			if(current.data==id){
				return true;
			}else if(current.data>id){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	public boolean delete(int id){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.data!=id){
			parent = current;
			if(current.data>id){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		
		if(current.left==null && current.right==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		
		else if(current.right==null){
			if(current==root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			
			
			Node successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}
	
	public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
	public void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
                        root.depth=1;
			return;
		}
		Node current = root;
		Node parent = null;
                int d=2;
		while(true){
			parent = current;
			if(id<current.data){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
                                        parent.left.depth=d;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
                                        parent.right.depth=d;
					return;
				}
			}
		d++;
                }
	}
	public void yazdir(Node root){
		if(root!=null){
			yazdir(root.left);
			System.out.print(" " + root.data);
			yazdir(root.right);
		}
	}
        
       
        public int derinlik(Node root)
        {
            if (root==null) {
                return 0;
            }
            else {
               int sold= derinlik(root.left);
               int sagd= derinlik(root.right);
                if (sold > sagd)
                return (sold + 1);
             else 
                return (sagd + 1);
            }
        
        }
        int sayi=0;
        public double ortderinlik(Node root)
        {
            
           if(root==null){
           return 0;
           }
           else{
               
               ortderinlik(root.left);
              ortderinlik(root.right);
               sayi+=root.depth;
                return (sayi);
              
               
	}
        
        }
        
	public static void main(String arg[]){
            double ortderinlikOrtalaması=0;
            for (int j = 0; j < 100; j++) {
                
            
		IkiliAramaAgaci b = new IkiliAramaAgaci();
                
                for (int i = 0; i < 100; i++) {
                    b.insert( (int)(Math.random()*100));
                
                    }


		System.out.println("Tree : ");
		b.yazdir(b.root); 
		System.out.println("");
                System.out.println("Kök:"+b.root.data);
                
                System.out.println("derinlik:"+b.derinlik(b.root));
                
                double a= b.ortderinlik(b.root)/100;
                ortderinlikOrtalaması+=a/100;
                System.out.println("ort derinlik:"+a);
                
                }
            System.out.println("ortderinlikOrtalaması:"+ortderinlikOrtalaması);
	}
}


    

