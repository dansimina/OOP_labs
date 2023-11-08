public class Main {
    public static void main(String[] args) {
        String sir = "Ana are mere";
        String vocale = "AEIOUaeiou";
        int nrVocale = 0, nrConsoane = 0;

        for(int i = 0; i < sir.length(); i++){
            if(sir.charAt(i) != ' '){
                if(vocale.indexOf(sir.charAt(i)) != -1){
                    nrVocale++;
                }
                else nrConsoane++;
            }
        }

        System.out.println("Nr vocale = " + nrVocale + "\n" + "Nr consoane = " + nrConsoane);
    }
}