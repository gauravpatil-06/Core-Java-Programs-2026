package com.gaurav.loopingstatement.nestedforloop;

public class AllStarPattern 
{
	public static void main(String[] args)
	{
		System.out.println("Square Star Pattern\n");
		
		// Square Star Pattern
		for(int i = 1; i <= 5; i++)   // Row
		{
			for(int j = 1; j <= 5; j++)   // Column
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Row Number Pattern\n");
		
		// Row Number Pattern
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Column Number Pattern\n");
		
		// Column Number Pattern
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Reverse Row Number Pattern\n");
		
		// Reverse Row Number Pattern
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Reverse Column Number Pattern\n");
		
		// Reverse Column Number Pattern
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= 1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Alphabet Square Pattern\n");
		
		// Alphabet Square Pattern
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print("A ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Alphabet Row Pattern\n");
		
		// Alphabet Row Pattern
		for(char i = 'A'; i <= 'E'; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Alphabet Column Pattern\n");
		
		// Alphabet Column Pattern
		for(int i = 1; i <= 5; i++)
		{
			for(char j = 'A'; j <= 'E'; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Reverse Alphabet Row Pattern\n");
		
		// Reverse Alphabet Row Pattern
		for(char i = 'E'; i >= 'A'; i--)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("\n-----------------------------");
		System.out.println("Reverse Alphabet Column Pattern\n");
		
		// Reverse Alphabet Column Pattern
		for(int i = 1; i <= 5; i++)
		{
			for(char j = 'E'; j >= 'A'; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n-----------------------------");
		System.out.println("Alphabet Column Mix Pattern\n");
		
		// Alphabet Column Mix Pattern
		for(int i = 1; i <= 5; i++)
		{
			for(char j = 'A'; j <= 'E'; j++)
			{
				if(i == 2)
				{
					System.out.print("* ");
				}
				else if(i == 4)
				{
					System.out.print("$ ");
				}
				else if(j == 3)
				{
					System.out.print("% ");
				}
				else
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}