Import java.util.Scanner;

public class Pset2 {
	public static void main (String[] args) {
		Pset2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}

	public void sayHello() {
		System.out.println("Enter First and Last Name:");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println();
		System.out.println("Hello, " + text);		
	}

	public void gradeMe() {
		System.out.println();
		System.out.println("Enter your homework grade:");
		Scanner in = new Scanner(System.in);
		float grade = in.nextFloat();
		System.out.println();

		System.out.println("Enter your homework grade:");
		Scanner in1 = new Scanner(System.in);
		float grade1 = in1.nextFloat();
		System.out.println();

		System.out.println("Enter your homework grade:");
		Scanner in11 = new Scanner(System.in);
		float grade2 = in11.nextFloat();
		System.out.println();

		System.out.println("Enter your quiz grade:");
		Scanner in111 = new Scanner(System.in);
		float grade3 = in111.nextFloat();
		System.out.println();

		System.out.println("Enter your quiz grade:");
		Scanner in1111 = new Scanner(System.in);
		float grade4 = in1111.nextFloat();
		System.out.println();

		System.out.println("Enter your quiz grade:");
		Scanner in11111 = new Scanner(System.in);
		float grade5 = in11111.nextFloat();
		System.out.println();

		System.out.println("Enter your test grade:");
		Scanner in111111 = new Scanner(System.in);
		float grade6 = in111111.nextFloat();

		System.out.println("Enter your test grade:");
		Scanner in1111111 = new Scanner(System.in);
		float grade7 = in1111111.nextFloat();
		
		System.out.println("Enter your test grade:");
		Scanner in11111111 = new Scanner(System.in);
		float grade8 = in11111111.nextFloat();

		float finalgrade = (float) ((float) ((grade + grade1 + grade2)*0.15 /3) + ((grade3 + grade4 + grade5)*0.30 / 3) + ((grade6 + grade7 + grade8))*0.55 / 3);
		System.out.println();
		System.out.println("Your Final Grade Is A");
		System.out.print(finalgrade);
		System.out.println();


	}

	public void groupUs() {
		System.out.println();
		System.out.println("How many students are attending the field trip?");
		Scanner in = new Scanner(System.in);
		int people = in.nextInt();
		System.out.println();

		System.out.println("How many teachers are attending the trip?");
		Scanner in1 = new Scanner(System.in);
		int teachers = in1.nextInt();
		if (people + teachers <= 46 )

		{
			System.out.println("You Will Need One Bus");
			System.out.println("The Amount Of The People On The Bus Is:" + (people + teachers));
		}

		else if (people + teachers > 46)
		{
		System.out.println();
		System.out.println("The Amount Of People on The Bus Is: "+ (teachers + people));
		System.out.println();
		int bus = (people + teachers) / 46 + 1;
		int nums = (people + teachers) - 47;
		System.out.println("Buses Required " + bus );
		System.out.println();
		System.out.println("The Amount of People On The Second Bus: " + nums);

		}
	}

	public void info() {
		System.out.println();
		System.out.println("What is your first name?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println();

		System.out.println("What is your last name?");
		Scanner in1 = new Scanner(System.in);
		String last = in1.nextLine();
		System.out.println();

		System.out.println("What is your grade level?");
		Scanner in11 = new Scanner(System.in);
		int level = in11.nextInt();
		System.out.println();

		System.out.println("What is your age?");
		Scanner in111 = new Scanner(System.in);
		int age = in111.nextInt();
		System.out.println();

		System.out.println("What is your hometown?");
		Scanner in1111 = new Scanner(System.in);
		String town = in1111.nextLine();
		System.out.println();

		System.out.println("NAME     : " + name + " " + last);
		System.out.println("GRADE    : " + level);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + town);
		System.out.println();

	}

	public void initials() {
		System.out.print("Please enter your first name: ");
		Scanner in = new Scanner (System.in);
		String first = in.nextLine();
		char a = first.charAt(0);

		System.out.print("Please enter your middle name: ");
		String middle = in.nextLine();
		char b = middle.charAt(0);

		System.out.print("Please enter your last name: ");
		String end = in.nextLine();
		char c = end.charAt(0);
		System.out.println();

		System.out.println("You initials are " + a + b + c );

	}
}

