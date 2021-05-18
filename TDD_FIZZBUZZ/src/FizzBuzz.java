public class FizzBuzz {
    public static String checked(int a){
        String numberToText = "";
       if (a>0 && a%3==0){
           return "Fizz";
       }
       if (a>0 && a%5==0){
           return "Buzz";
       }
       if (a>0 && a%3==0 && a%5==0){
           return "FizzBuzz";
       }
           return " ";
    }
    public static String chuyenThanhChu(int a){
        String hienthi = "";
        int donvi = a%10;
        int chuc = (a%100)/10;
        if (donvi == 3 || chuc == 3){
            return "Fizz";
        }
        if (donvi == 5 || chuc == 5){
            return "Buzz";
        } else {
            if (a>10){
                switch (chuc){
                    case 1:
                        hienthi+= "muoi";
                        break;
                    case 2:
                        hienthi+= "hai";
                        break;
                    case 4:
                        hienthi+= "bon";
                        break;
                    case 6:
                        hienthi+= "sau";
                        break;
                    case 7:
                        hienthi+= "bay";
                        break;
                    case 8:
                        hienthi+= "tam";
                        break;
                    case 9:
                        hienthi+= "chin";
                        break;
                    default:
                        return hienthi;
                }
            }
            switch (donvi){
                case 1:
                    hienthi+= "mot";
                    break;
                case 2:
                    hienthi+= "hai";
                    break;
                case 4:
                    hienthi+= "bon";
                    break;
                case 6:
                    hienthi+= "sau";
                    break;
                case 7:
                    hienthi+= "bay";
                    break;
                case 8:
                    hienthi+= "tam";
                    break;
                case 9:
                    hienthi+= "chin";
                    break;
            }
            return hienthi;

        }

    }
}
