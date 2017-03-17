using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AlgAnalizHafta4
{
    class myClass
    {
        
        int[] dizi = new int[5];
        int capacity = 5;
        int size = 0;
        public void add(int sayi)
        {
            if (ensureCapacity())
            {
                dizi[size] = sayi;
            }
            else
            {
                int[] temp = new int[capacity];
                capacity *=2;
                
                
                for (int i = 0; i < size; i++)
                {
                    temp[i] = dizi[i];
                }
                dizi = new int[capacity];
                Array.Copy(temp, dizi, size);

                    dizi[size] = sayi;

            }

            size++;
            
        }
        // Add fonksiyonu karmaşıklığı O(n).

        private bool ensureCapacity()
        {
            if (capacity > size)
                return true;
            else
                return false;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            myClass myClass = new myClass();
            myClass myClass2;


            for (int i = 2; i < 100; i++)
            {
                myClass.add(i);
            }
            myClass2 = myClass;
            //shallow copy yapıyor. O(1).
        }
    }
}
