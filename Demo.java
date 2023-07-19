class shape
{
  void show ()
  {
    System.out.println ("new shape");
  }
}

class square extends shape
{
  @Override void show ()
  {
    System.out.println ("its a square shape");
  }
}

class Demo
{

  public static void main (String[]args)
  {
    shape r = new square ();
      r.show ();
  }
}
