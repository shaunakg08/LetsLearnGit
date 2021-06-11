class Sum
{ public static void main(String[] args)
  { int n=35;
    if(n%3==0 && n%5==0)
    System.out.println("FizzBuzz");
    else if(n%5==0)
    System.out.println("Buzz");
    else if(n%3==0)
    System.out.println("Fizz");
    else
    System.out.println("check the number");
}
}