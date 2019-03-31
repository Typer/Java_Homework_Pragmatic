/*
Създайте клас Computer, който представя компютър. Класът да има следните полета:
year – числова стойност показваща година на производство на компютъра
price – числова стойност (не е задължително да е цяло число) показваща цената на компютъра
isNotebook – булева стойност – дали компютъра е преносим или не
hardDiskMemory – числова стойност за размера на хардиска
freeMemory – числова стойност показваща размера на свободната памет
operationSystem – текстово поле за операционната система на компютъра

Класът да дефинира следните методи:

-метод void changeOperationSystem(String newOperationSystem), който сменя стойността на полето operationSystem със
стойността подадена като параметър.
-метод void useMemory(double memory), който намалява свободната памет (freeMemory) със стойността подадена като аргумент.
Ако стойността на аргумента е по-голяма от свободната памет, извеждa съобщение "Not enough free memory!"

Да се създаде клас ComputerDemo, с main метод.

В рамките на main метода да се създадат 2 обекта от тип Computer. Да се зададат стойности на всеки от компютрите за
year, price, hardDiskMemory, freeMemory, operationSystem.Нека единият компютър да е
лаптоп. На единия от двата компютъра да се задели памет 100 (чрез метода useMemory), а на другия, да се смени
операционната система (чрез метода changeOperationSystem), след което да се изведат на екрана всичките полета на
двата компютъра.
 */
public class Computer {
    int year;
    double price;
    boolean isNoteBook;
    double hardDiskMemory;
    double freeDiskMemory;
    String operationSystem;

        Computer(int year, double price, boolean isNoteBook, double hardDiskMemory, String os){
            this.year = year;
            this.price = price;
            this.isNoteBook = isNoteBook;
            this.hardDiskMemory = hardDiskMemory;
            freeDiskMemory = hardDiskMemory;
            operationSystem = os;
        }

        public String isnotebook(){
            if (isNoteBook){
                return "Laptop";
            }else{
                return "Desktop Machine";
            }
        }

        public void changeOperationSystem(String newOperationSystem){
            this.operationSystem = newOperationSystem;
        }

        public void useMemory(double memory){
            if (memory > freeDiskMemory){
                System.out.println("Not enough free memory!");
            }else{
                freeDiskMemory -= memory;
            }
        }
}
