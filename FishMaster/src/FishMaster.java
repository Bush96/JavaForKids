class Fish {
    int currentDepth = 0;
    final int DEFAULT_DIVING = 5;

    public int dive() {
        currentDepth = currentDepth + DEFAULT_DIVING;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка и " +
                    " не могу нырять глубже 100 метров");
            currentDepth = currentDepth - DEFAULT_DIVING;
        } else {
            System.out.println("Погружаюсь на " +
                    DEFAULT_DIVING + " м");
            System.out.println("Я на " + currentDepth +
                    " метров ниже уровня моря");
        }
        return currentDepth;
    }

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка и " +
                    " не могу нырять глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("Погружаюсь на " + howDeep + " м.");
            System.out.println("Я на " + currentDepth +
                    " м. ниже уровня моря");
        }
        return currentDepth;
    }

    public String say(String something) {
        return "Ты не знаешь, что рыбы не умеют говорить?";
    }

    // constructor
    Fish(int startingPosition) {
        currentDepth = startingPosition;
    }

    Fish() {
        currentDepth = 10;
        System.out.println("Установлено значение стартовой позиции " + currentDepth + " метров");
    }
}

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish();
        myFish.dive();

    }
}
