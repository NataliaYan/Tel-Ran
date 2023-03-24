import java.util.Scanner;

public class Main {
    public static boolean result;
          public static void main(String[] args) {

        System.out.println("Мониторинг экологических рисков: ");
        System.out.println("Прошу ответить на вопросы, указывая уровень риска от 1(мин) до 10(макс) ");
        System.out.println();

        System.out.print("Загрязнение воздуха - >  ");
        answerQwetion();
        boolean airPollution = result;
        System.out.println("критично :" + airPollution);
        System.out.print("Разрушение озонового слоя - >  ");
        answerQwetion();
        boolean ozoneDepletion = result;
        System.out.println("критично :" + ozoneDepletion);
        System.out.print("Загрязнения водных объектов - >  ");
        answerQwetion();
        boolean pollutionOfWater = result;
        System.out.println("критично :" + pollutionOfWater);
        System.out.print("Изменение климата - >  ");
        answerQwetion();
        boolean climaticСhange = result;
        System.out.println("критично :" + climaticСhange);
        System.out.print("Высокое загрязнение экосистемы химическими и токсичными веществами - >  ");
        answerQwetion();
        boolean chemicalsToxicSub = result;
        System.out.println("критично :" + chemicalsToxicSub);
        System.out.print("Увеличением парниковых газов? - >  ");
        answerQwetion();
        boolean increaseGreenGases = result;
        System.out.println("критично :" + increaseGreenGases);
        System.out.print("Высокий уровень загрязнения отходами - >  ");
        answerQwetion();
        boolean wastePollution = result;
        System.out.println("критично :" + wastePollution);
        System.out.print("Природные ископаемые ресурсы истощены - >  ");
        answerQwetion();
        boolean naturalResources = result;
        System.out.println("критично :" + naturalResources);
        System.out.print("Уменьшение плодородности растений - >  ");
        answerQwetion();
        boolean reducedPlant = result;
        System.out.println("критично :" + reducedPlant);
        System.out.print("Потеря биоразнообразия и живых организмов - >  ");
        answerQwetion();
        boolean biodiversityDue = result;
        System.out.println("критично :" + biodiversityDue);
        System.out.println();

        boolean riskEco = airPollution && ozoneDepletion && climaticСhange && chemicalsToxicSub && wastePollution && naturalResources && reducedPlant && biodiversityDue;

        System.out.println("Экологический риск высокий : " + riskEco);

        if (riskEco == false) {
            System.out.print("А что насчет угрозы ядерной войны или нападения пришельцев? (1-есть 0-нет) ");
            Scanner scanner = new Scanner(System.in);
            int threat = scanner.nextInt();
            if (threat == 1)
                result = false;
            else
                result = true;
            boolean isPlanetSafe = result && !riskEco;
            System.out.println("is planet safe : " + isPlanetSafe);
        }
        else {
            System.out.println("Мы можем это исправить? (1-да 0-нет)");
            Scanner scanner = new Scanner(System.in);
            int helpPlanet = scanner.nextInt();
            if (helpPlanet == 1)
                result = true;
            else
                result = false;
            boolean isPlanetSafe = result || !riskEco;
            System.out.println("is planet safe : " + isPlanetSafe);
        }
    }


    public static boolean answerQwetion() {
        Scanner scanner = new Scanner(System.in);
        int risk = scanner.nextInt();

        if (risk <= 5)
            result = false;
        else
            result = true;
        return result;


    }

}
