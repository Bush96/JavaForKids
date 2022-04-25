public class temperatureConverter {
        int temperature = 101;
        char convertTOC = 'C';
        char convertTOF = 'F';
        double y = temperature * 1.8 + 32;

        public void convertTemp(int temperature, char convertTO) {
            System.out.println("Температура в Цельсиях составляет " + temperature + convertTOC);
            System.out.println("Температура в Фаренгейтах составляет " + y + convertTOF);
        }

        public static void main(String[] args) {
            temperatureConverter tc = new temperatureConverter();
            tc.convertTemp(3, 'F');
        }
    }







