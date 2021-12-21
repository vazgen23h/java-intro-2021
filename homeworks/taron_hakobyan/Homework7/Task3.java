class Task3 {
  public static void main(String[] args) {
     for (int it = 0; it < args.length; ++it) {
      String num = args[it];
      int n = num.length();
      int dotCount = 0, minusCount = 0;
      boolean isDouble = true;
      for (int i = 0; i < n && isDouble; ++i) {
        if (num.charAt(i) == '.') {
          ++dotCount;
          if (dotCount == 2) {
            isDouble = false;
            continue;
          }
          continue;
        }
        if (num.charAt(i) == '-') {
          ++minusCount;
          if (minusCount == 2) {
            isDouble = false;
            continue;
          }
          continue;
        }
        if (num.charAt(i) < '0' || num.charAt(i) > '9') {
          isDouble = false;
        }
      }
      if (dotCount == 0 && num.charAt(0) == '0' && n > 1) {
        isDouble = false;
      }
      if (minusCount == 1 && num.charAt(0) != '-') {
        isDouble = false;
      }
      if (num.equals("-0")) {
        isDouble = false;
      }
      if (!isDouble) {
        System.out.print(n + " ");
      } else {
        System.out.print("8 ");
      }
    }
  }
}