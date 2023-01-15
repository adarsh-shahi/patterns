class solve {
  public static void main(String[] args) {
    pattern4(10);
  }

  static void pattern1(int n) {
    for (int i = 0; i < (2 * n) - 1; i++) {
      if (i >= n) {
        for (int j = 0; j < (2 * n - i - 1); j++) {
          System.out.print("* ");
        }
      } else {
        for (int j = 0; j <= i; j++) {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }

  static void pattern2(int n) {
    for (int i = 0; i < 2 * n - 1; i++) {
      if (i < n) {
        for (int j = 0; j < n - i - 1; j++) {
          System.out.print("  ");
        }
        for (int j = 0; j <= i; j++) {
          System.out.print("* ");
        }
      } else {
        for (int j = 0; j <= i - n; j++) {
          System.out.print("  ");

        }
        for (int j = 0; j < 2 * n - i - 1; j++) {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int i = 0; i < n + 1; i++) {
      if (i <= n / 2) {
        for (int j = 0; j < (n - (2 * i)) / 2; j++) {
          System.out.print("  ");
        }
        for (int j = 0; j < 2 * i + 1; j++) {
          System.out.print("* ");
        }
        for (int j = 0; j < (n - 2 * i) / 2; j++) {
          System.out.print("  ");
        }
      } else {
        for (int j = 0; j < (2 * i - n) / 2; j++) {
          System.out.print("  ");
        }
        for (int j = 0; j <= (n - i) * 2; j++) {
          System.out.print("* ");
        }
        for (int j = 0; j < (2 * i - n) / 2; j++) {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  static void pattern4(int n) {
    for (int i = 0; i < n; i++) {
      if (i < n / 2) {
        for (int j = 0; j < (n - (2 * i)) / 2; j++) {
          System.out.print("* ");
        }
        for (int j = 0; j < i * 2; j++) {
          System.out.print("  ");
        }
        for (int j = 0; j < (n - (2 * i)) / 2; j++) {
          System.out.print("* ");
        }
        System.out.println();
      } else {
        for (int j = 0; j < ((2 * i - n) / 2) + 1; j++) {
          System.out.print("* ");
        }
        for (int j = 0; j < (2 * (n -  ((2 * i) / 2))) - 2; j++) {
          System.out.print("  ");
        }
        for (int j = 0; j < (2 * i - n) / 2 + 1; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }
}
