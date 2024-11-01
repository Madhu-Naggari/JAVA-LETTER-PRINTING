import java.util.Scanner;

class Testing {
    static int r;
    static int c;
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name :");
        String name = sc.nextLine().toUpperCase();
        int l = name.length();
        System.out.println();
        for (r = 0; r < 7; r++) {// to print in a row it can decide row
            for (c = 0; c < l; c++) {// string length itteration
                if (c <= 10) {
                    if (name.charAt(c) == 'A') {
                        for (k = 0; k < 5; k++) {// to get in a column each of five
                            if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3)
                                System.out.print("* ");
                            else if (r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0 || k == 4)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'I') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6)
                                System.out.print("* ");
                            else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 2)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'B') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'C') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'D') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'E') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'F') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'G') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2 || k == 3 || k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 3 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'H') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'J') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 4 || r == 5 || r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'K') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'L') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'M') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 1 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'N') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 1 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 1 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 4 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 4 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'O') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6 || r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'P') {
                        for (k = 0; k < 5; k++) {
                            if (r == 4 || r == 5 || r == 6) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Q') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 2 || k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'R') {
                        for (k = 0; k < 5; k++) {
                            if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'S') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'T') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 4 || r == 5 || r == 3 || r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'U') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'V') {
                        for (k = 0; k < 5; k++) {// to get in a column each of five
                            if (r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0 || r == 1 || r == 2 || r == 4 || r == 3 || r == 6) {
                                if (k == 0 || k == 4)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else if (r == 5) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'W') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 1 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'X') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 5 || r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 2) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Y') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2 || r == 3 || r == 4 || r == 5 || r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Z') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '_') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '.') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 5 || r == 4) {
                                if (k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } // number section started
                    else if (name.charAt(c) == '0') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6 || r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '1') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 4 || r == 5) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 1) {
                                if (k == 1 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 2) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '2') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '3') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 2 || r == 4) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '4') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 3 || k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5 || r == 6) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '5') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '6') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '7') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5 || r == 3 || r == 6) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '8') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '9') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.print("\n");
        for (r = 0; r < 7; r++) {// to print in a row it can decide row
            for (c = 11; c < l; c++) {// string length itteration
                if (c > 10 && c <= 20) {
                    if (name.charAt(c) == 'A') {
                        for (k = 0; k < 5; k++) {// to get in a column each of five
                            if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3)
                                System.out.print("* ");
                            else if (r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0 || k == 4)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'I') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6)
                                System.out.print("* ");
                            else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 2)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'B') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'C') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'D') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'E') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'F') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'G') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2 || k == 3 || k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 3 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'H') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'J') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 4 || r == 5 || r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'K') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'L') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'M') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 1 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'N') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 1 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 1 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 4 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 4 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'O') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6 || r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'P') {
                        for (k = 0; k < 5; k++) {
                            if (r == 4 || r == 5 || r == 6) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Q') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 2 || k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'R') {
                        for (k = 0; k < 5; k++) {
                            if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'S') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'T') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 4 || r == 5 || r == 3 || r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'U') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'V') {
                        for (k = 0; k < 5; k++) {// to get in a column each of five
                            if (r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0 || r == 1 || r == 2 || r == 4 || r == 3 || r == 6) {
                                if (k == 0 || k == 4)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else if (r == 5) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'W') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 1 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'X') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 5 || r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 2) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Y') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2 || r == 3 || r == 4 || r == 5 || r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Z') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '_') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '.') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 5 || r == 4) {
                                if (k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } // number section started
                    else if (name.charAt(c) == '0') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6 || r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '1') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 4 || r == 5) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 1) {
                                if (k == 1 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 2) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '2') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '3') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 2 || r == 4) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '4') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 3 || k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5 || r == 6) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '5') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '6') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '7') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5 || r == 3 || r == 6) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '8') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '9') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.print("\n");
        for (r = 0; r < 7; r++) {// to print in a row it can decide row
            for (c = 21; c < l; c++) {// string length itteration
                if (c > 20 && c <= 30) {
                    if (name.charAt(c) == 'A') {
                        for (k = 0; k < 5; k++) {// to get in a column each of five
                            if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3)
                                System.out.print("* ");
                            else if (r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0 || k == 4)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'I') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6)
                                System.out.print("* ");
                            else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 2)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'B') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'C') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'D') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'E') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'F') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'G') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2 || k == 3 || k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 3 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'H') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'J') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 4 || r == 5 || r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'K') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'L') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'M') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 1 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'N') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 1 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 1 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 4 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 4 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'O') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6 || r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'P') {
                        for (k = 0; k < 5; k++) {
                            if (r == 4 || r == 5 || r == 6) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Q') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 2 || k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'R') {
                        for (k = 0; k < 5; k++) {
                            if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'S') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'T') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 4 || r == 5 || r == 3 || r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'U') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'V') {
                        for (k = 0; k < 5; k++) {// to get in a column each of five
                            if (r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0 || r == 1 || r == 2 || r == 4 || r == 3 || r == 6) {
                                if (k == 0 || k == 4)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else if (r == 5) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'W') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 1 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'X') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 5 || r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 2) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Y') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2 || r == 3 || r == 4 || r == 5 || r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Z') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '_') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '.') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 5 || r == 4) {
                                if (k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } // number section started
                    else if (name.charAt(c) == '0') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6 || r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '1') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 4 || r == 5) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 1) {
                                if (k == 1 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 2) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '2') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '3') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 2 || r == 4) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '4') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 3 || k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5 || r == 6) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '5') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '6') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '7') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5 || r == 3 || r == 6) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '8') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '9') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        System.out.print("\n");
        for (r = 0; r < 7; r++) {// to print in a row it can decide row
            for (c = 21; c < l; c++) {// string length itteration
                if (c > 30 && c <= 40) {
                    if (name.charAt(c) == 'A') {
                        for (k = 0; k < 5; k++) {// to get in a column each of five
                            if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3)
                                System.out.print("* ");
                            else if (r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0 || k == 4)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'I') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6)
                                System.out.print("* ");
                            else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 2)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'B') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'C') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'D') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'E') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'F') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'G') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2 || k == 3 || k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 3 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'H') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 4 || r == 5 || r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'J') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 4 || r == 5 || r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'K') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'L') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'M') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 1 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'N') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 1 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 1 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 4 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 4 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'O') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6 || r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'P') {
                        for (k = 0; k < 5; k++) {
                            if (r == 4 || r == 5 || r == 6) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Q') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 2 || k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'R') {
                        for (k = 0; k < 5; k++) {
                            if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'S') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'T') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 4 || r == 5 || r == 3 || r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'U') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'V') {
                        for (k = 0; k < 5; k++) {// to get in a column each of five
                            if (r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0 || r == 1 || r == 2 || r == 4 || r == 3 || r == 6) {
                                if (k == 0 || k == 4)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else if (r == 5) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'W') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 0 || k == 2 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 0 || k == 1 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'X') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 5 || r == 6) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 2) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Y') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 1 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2 || r == 3 || r == 4 || r == 5 || r == 6) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == 'Z') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '_') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '.') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 6) {
                                if (k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("  ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 5 || r == 4) {
                                if (k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } // number section started
                    else if (name.charAt(c) == '0') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6 || r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '1') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 4 || r == 5) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 1) {
                                if (k == 1 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 2) {
                                if (k == 0 || k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '2') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 5) {
                                if (k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '3') {
                        for (k = 0; k < 5; k++) {
                            if (r == 1 || r == 5) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                            if (r == 2 || r == 4) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 0 || r == 6) {
                                if (k == 1 || k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '4') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 2 || k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 3 || k == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 3) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5 || r == 6) {
                                if (k == 3) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '5') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '6') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '7') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 2) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5 || r == 3 || r == 6) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '8') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4 || k == 0) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    } else if (name.charAt(c) == '9') {
                        for (k = 0; k < 5; k++) {
                            if (r == 0 || r == 3 || r == 6) {
                                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 1 || r == 2) {
                                if (k == 0 || k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else if (r == 4 || r == 5) {
                                if (k == 4) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }
                        }
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}