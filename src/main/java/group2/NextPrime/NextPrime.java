package group2.NextPrime;

public class NextPrime {
    public static Integer nextPrime(Integer n) {
    if (n < 2) {
        return 2;
    }
        for (int i = n + 1; i < n * 2; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
            return 2;
        }

        public static boolean isPrime(Integer n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
        }
            return true;
    }
}

//kontrollin,kas number, mis sisse tuleb on väiksem kui 2, kui on, siis tagastan 2 - 2 on esimene prime number
//kui number on suurem kui 2, siis alustan tsüklit, mis algab numbrist n+1 ja lõpeb n*2 - see on sellepärast, et prime number on alati väiksem kui 2 korda see number
//tsüklis kontrollin, kas number on prime, kasutades isPrime meetodit
//kui leian prime numbri, siis tagastan selle
//kui tsükkel lõpeb ja ma ei leia ühtegi prime numbrit, siis tagastan 2 - see on turvameede, mis ei tohiks kunagi juhtuda
//isPrime meetodis kontrollin, kas number on väiksem kui 2, kui on, siis tagastan false
//kui number on suurem kui 2, siis alustan tsüklit, mis algab 2-st ja lõpeb n-1
//tsüklis kontrollin, kas n jagub i-ga, kui jagub, siis tagastan false
//kui tsükkel lõpeb ja ma ei leia ühtegi jagajat, siis tagastan true, mis tähendab, et number on prime