public class TinhNgayTiepTheo {
    public static boolean checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static String nextDay(int day, int month, int year) {
        switch (month) {
            case 2:
                if (checkYear(year)) {
                    if (day == 29) {
                        day = 1;
                        month += 1;
                        return "next day: " + day + "/" + month + "/" + year;
                    } else if (day > 0 && day < 29) {
                        day += 1;
                        return "next day: " + day + "/" + month + "/" + year;
                    } else {
                        return "không tìm thấy ngày";
                    }
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month += 1;
                    return "next day: " + day + "/" + month + "/" + year;
                } else if (day > 0 && day < 31) {
                    day += 1;
                    return "next day: " + day + "/" + month + "/" + year;
                } else {
                    return "số ngày k có";
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month += 1;
                    return "next day: " + day + "/" + month + "/" + year;
                } else if (day > 0 && day < 30) {
                    day += 1;
                    return "next day: " + day + "/" + month + "/" + year;
                } else {
                    return "số ngày k có";
                }
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year += 1;
                    return "next day: " + day + "/" + month + "/" + year;
                } else if (day > 0 && day < 31) {
                    day += 1;
                    return "next day: " + day + "/" + month + "/" + year;
                } else {
                    return "số ngày k có";
                }

        }
        return " ";

    }
}
