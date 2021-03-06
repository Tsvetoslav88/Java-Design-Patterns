package ch05_singleton.classic;

public class Singleton {
  
  private static Singleton uniqueInstance;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}

// Not thread safe.
