package devoirs.devoir04;

public class devoir04 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 2;
        int day = 29;
        System.out.println("date entrée est le " + day + "." + month + "." + year);

        if (day > 0 && day < 32) {
            if (year > 0 && year < 9999) {
                switch (month) {
                    case 1:
                        System.out.println("date formatée est le " + day + " janvier " + year);

                        break;
                    case 2:
                        if (year % 4 == 0 && day == 29) {
                            System.out.println("date formatée est le " + day + " février " + year);

                        } else if (day >= 29) {
                            System.out.println("Le jour [" + day + "] est hors limites !");

                        } else {
                            System.out.println("date formatée est le " + day + " février " + year);
                        }

                        break;
                    case 3:
                        System.out.println("date formatée est le " + day + " mars " + year);

                        break;
                    case 4:
                        if (day == 31) {
                            System.out.println("Le jour [" + day + "] est hors limites !");

                        } else {
                            System.out.println("date formatée est le " + day + " avril " + year);
                        }

                        break;
                    case 5:
                        System.out.println("date formatée est le " + day + " mai " + year);

                        break;
                    case 6:
                        if (day == 31) {
                            System.out.println("Le jour [" + day + "] est hors limites !");

                        } else {
                            System.out.println("date formatée est le " + day + " juin " + year);
                        }

                        break;
                    case 7:
                        System.out.println("date formatée est le " + day + " juillet " + year);

                        break;
                    case 8:
                        System.out.println("date formatée est le " + day + " août " + year);

                        break;
                    case 9:
                        if (day == 31) {
                            System.out.println("Le jour [" + day + "] est hors limites !");

                        } else {
                            System.out.println("date formatée est le " + day + " septembre " + year);
                        }

                        break;
                    case 10:
                        System.out.println("date formatée est le " + day + " octobre " + year);

                        break;
                    case 11:
                        if (day == 31) {
                            System.out.println("Le jour [" + day + "] est hors limites !");

                        } else {
                            System.out.println("date formatée est le " + day + " novembre " + year);
                        }

                        break;

                    case 12:
                        System.out.println("date formatée est le " + day + " décembre " + year);

                        break;

                    default:
                        System.out.println("mois invalide !");
                        break;
                }
            } else {
                System.out.println("L'année [" + year + "] est hors limites !");
            }
        } else {
            System.out.println("Le jour [" + day + "] est hors limites !");
        }
    }

}
