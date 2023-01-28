package de.telran.averchenko.elena.homework4.tires;

public class TestAuto {
    public static void main(String[] args) {
        Auto petrolAuto = new PetrolAuto(2000,"Audi", "B6","summer","summer","summer","summer");
        Auto dieselAuto = new DieselAuto(2006,"Opel", "TRX","winter","summer","summer","summer");
        Auto hybridAuto = new HybridAuto(2020,"Talbot", "AAT","winter","winter","winter","winter");
        Auto electricAuto = new ElectricAuto(2023,"Mercedes", "Some","winter","winter","summer","winter");

        //можно вывести или раскомментировать строки в методах для проверки
//        petrolAuto.starts(true);
//        dieselAuto.starts(false);
//        hybridAuto.starts(true);
//        electricAuto.starts(false);

        System.out.println("\n_____________________________");
        System.out.println("DRIVE Method");
        petrolAuto.drive(100);
        dieselAuto.drive(50);
        hybridAuto.drive(30);
        electricAuto.drive(200);
        hybridAuto.drive(10);


        System.out.println("\n_____________________________");
        System.out.println("BREAKS Method");
        petrolAuto.breaks(petrolAuto.starts(true),true);
        dieselAuto.breaks(dieselAuto.starts(false), true);
        hybridAuto.breaks(hybridAuto.starts(true),false);
        electricAuto.breaks(electricAuto.starts(false), false);

        System.out.println("\n_____________________________");
        System.out.println("CHECK_TIRES Method");
        ModernAutoService modernAutoService = new ModernAutoService();
        System.out.println(ModernAutoService.checkTires(petrolAuto,"summer"));
        System.out.println(ModernAutoService.checkTires(dieselAuto,"winter"));
        System.out.println(ModernAutoService.checkTires(hybridAuto,"summer"));
        System.out.println(ModernAutoService.checkTires(electricAuto,"winter"));

        System.out.println("\n_____________________________");
        System.out.println("CHANGE_TIRE Method");
        modernAutoService.changeTire(ModernAutoService.checkTires(petrolAuto,"summer"));
        modernAutoService.changeTire(ModernAutoService.checkTires(dieselAuto,"winter"));
        modernAutoService.changeTire(ModernAutoService.checkTires(hybridAuto,"summer"));
        modernAutoService.changeTire(ModernAutoService.checkTires(electricAuto,"winter"));

        System.out.println("\n_____________________________");
        System.out.println("REPAIR Method");
        modernAutoService.repair(!petrolAuto.starts(true));
        modernAutoService.repair(!dieselAuto.starts(false));
        modernAutoService.repair(!hybridAuto.starts(true));
        modernAutoService.repair(!electricAuto.starts(false));




    }
}
