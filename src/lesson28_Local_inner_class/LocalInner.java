package lesson28_Local_inner_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    private int a;                  // 1

    public void getResult() {

        // Local inner class располагается в блоках кода таких, как, например метод или конструктор
        // Local inner class не может быть static
        // Область видимости Local inner class это блок в котором он находится
        // Local inner class может обращаться даже к private элементам внешнего класса(1)

        class Delenie {
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(a);              // 1
                return delimoe % delitel;
            }
        }
        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Ostatok = " + delenie.getOstatok());
        System.out.println("Chastnoe = " + delenie.getChastnoe());
    }
}
