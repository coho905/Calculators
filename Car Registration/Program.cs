using System;

namespace Car
{
    class Program
    {
        static void Main(string[] args)
        {
            int weight;
            Console.WriteLine("Enter the weight to see the registration cost:");
            weight = Convert.ToInt32(Console.ReadLine());
            if (weight <= 0)
            {
                Console.WriteLine("There was an error.");
            }
            else if (weight <= 1500)
            {
                Console.WriteLine("The cost will be $150.50");
            }
            else if (weight <= 2500)
            {
                Console.WriteLine("The cost will be $225.75");
            }
            else if (weight <= 3000)
            {
                Console.WriteLine("The cost will be $300.25");
            }
            else
            {
                Console.WriteLine("The cost will be $351.37");
            }
        }
    }
}
