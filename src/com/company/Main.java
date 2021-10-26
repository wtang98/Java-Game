package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        System.out.println(" " +
                "         /\\       /\\\n" +
                "        / (       ) \\ \n" +
                "       / /\\)     (/\\ \\\n" +
                "      / /   (\\      \\ \\\n" +
                "     / /    ; \\_/)   \\ \\\n" +
                "    / /    (,-. (     \\ \\\n" +
                "   / /         ) )     \\ \\\n" +
                "  / /       ,-','       \\ \\  \n" +
                " / /     (\\(  (  /)      \\ \\   \n" +
                "/  '._____)\\)  \\/(______,'  \\\n" +
                "\\                           /\n" +
                " \\     .-.         ,-.     /\n" +
                "  \\   /   \\/\\   (\\/   \\   /\n" +
                "   \\  \\      \\   )    /  / \n" +
                "    \\  \\      ) /   ,'  / \n" +
                "     \\  \\    / /   |   /\n" +
                "      \\  \\   \\ \\   |  /\n" +
                "       \\  )   ) )  | /\n" +
                "        \\ |  / /   (/\n" +
                "         \\) / /    \n" +
                "           / /  /)  \n" +
                "           \\ \\_/ )\n" +
                "            \\   /\n" +
                "             \\_/\n " +

                "Ralof: Hey, you. You're finally awake. You were trying to cross the border,\n" +
                "       right? Walked right into that Imperial ambush, same as us, and that\n" +
                "       thief over there.\n" +
                ".....\n" +
                "Hadvar: Wait, you there. Step forward. Who are you? enter name;\n" );

        //players name
        Scanner name = new Scanner(System.in);
        String playerName = name.nextLine();

        //players race
        Scanner race = new Scanner(System.in);
        System.out.println("type in your race");
        System.out.println("[1]Orc");
        System.out.println("[2]Nord");
        System.out.println("[3]Wood Elf");
        System.out.println("[4]High Elf");
        System.out.println("[5]Khajiit");
        int raceId = race.nextInt();

        double playerHealth;
        int playerMana;
        int playerStamina;
        String playerRace = null;
        int cheesewheel = 5;
        if (raceId == 1) {
            playerHealth = 300;
            playerMana = 0;
            playerStamina = 250;
        } else if (raceId == 2) {
            playerHealth = 250;
            playerMana = 150;
            playerStamina = 200;
        } else if (raceId == 3) {
            playerHealth = 150;
            playerMana = 200;
            playerStamina = 200;
        } else if (raceId == 4) {
            playerHealth = 150;
            playerMana = 500;
            playerStamina = 50;
        } else {
            playerHealth = 200;
            playerMana = 200;
            playerStamina = 200;
        }


//                String playerRace;
        switch (raceId) {
            case 1:
                playerRace = "orc";
                System.out.println("You from one of the strongholds, Orc? How did you end up here?\n");
                break;
            case 2:
                playerRace = "Nord";
                System.out.println("You picked a bad time to come home to Skyrim, kinsman\n");
                break;
            case 3:
                playerRace = "Wood Elf";
                System.out.println("Not many wood elves would choose to come alone to Skyrim\n");
                break;
            case 4:
                playerRace = "High Elf";
                System.out.println("You're not with the Thalmor Embassy, are you, high elf? No, that can't be right... \n");
                break;
            case 5:
                playerRace = "Khajiit";
                System.out.println("You with one of the trade caravans, Khajiit? Your kind always seems to find trouble.\n ");
                break;
        }

        // new player
        Player player1 = new Player(playerName, playerRace, playerHealth, cheesewheel);
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("*Hadvar turns to her captain* \n" +
                "Captain, what should we do? He's not on the list.\n" +
                "\n" +
                "Imperial Captain: Forget the list. He goes to the block.\n" +
                "\n" +
                "Hadvar: By your orders, captain.\n");
        TimeUnit.MILLISECONDS.sleep(700);
        switch (playerRace) {
            case "Orc":
                System.out.println("I'm sorry. We'll make sure your remains are returned to Orsinium " + player1.getName() + "\n");
                break;
            case "Nord":
                System.out.println("I'm sorry. We'll make sure your remains are returned to Elsweyr " + player1.getName() + "\n");
                break;
            case "Wood Elf":
                System.out.println("I'm sorry. We'll make sure your remains are returned to Valenwood " + player1.getName() + "\n");
                break;
            case "High Elf":
                System.out.println("I'm sorry. We'll make sure your remains are returned to Black Marsh." + player1.getName() + "\n");
                break;
            case "Khajiit":
                System.out.println("I'm sorry. We'll make sure your remains are returned to the Summerset Isle." + player1.getName() + "\n");
                break;
        }
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println(" ......\n" +
                "[They behead the Stormcloak, eliciting responses from the onlookers.]\n" +
                "\n" +
                "Stormcloak Soldier 2: You Imperial bastards!\n" +
                "\n" +
                "Vilod: Justice!\n" +
                "\n" +
                "Ingrid: Death to the Stormcloaks!\n" +
                "\n" +
                "Ralof: As fearless in death as he was in life.\n");
        TimeUnit.MILLISECONDS.sleep(700);
        switch (playerRace) {
            case "Orc":
                System.out.println("Imperial Captain: Next the Orc\n");
                break;
            case "Nord":
                System.out.println("Imperial Captain: Next the Nord\n");
                break;
            case "Wood Elf":
                System.out.println("Imperial Captain: Next the Wood Elf\n");
                break;
            case "High Elf":
                System.out.println("Imperial Captain: Next the High Elf\n");
                break;
            case "Khajiit":
                System.out.println("Imperial Captain: Next the Khajiit\n");
                break;
        }
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("" +
                "Tullius: What in Oblivion is that?\n" +
                "\n" +
                "Imperial Captain: Sentries! What do you see?\n" +
                "\n" +
                "Imperial Soldier: It's in the clouds!\n" +
                "\n" +
                "[The creature, know seen as a dragon, lands on a tower, surprising everyone.]\n" +
                "\n" +
                "Stormcloak Soldier: Dragon!\n" +
                "\n" +
                "[The dragon uses its voice on the crowd, killing the headsman.]\n" +
                "\n" +
                "Headsman: Nngh!\n" +
                "\n" +
                "Tullius: Don't just stand there, kill that thing! Guards, get the townspeople\n" +
                "         to safety!\n" +
                playerName + " sees some weapons lying on the ground and you choose one."
        );

        Scanner PlayerWeapons = new Scanner(System.in);
        System.out.println("[1]War Hammer");
        System.out.println("[2]One-Handed Sword");
        System.out.println("[3]Bow");
        System.out.println("[4]Mages Staff");
        System.out.println("[5]Dagger");
        int playerWeaponId = PlayerWeapons.nextInt();

        int weaponDamage = 0;
        double critChance = 0;
        int missChance=0;
        double critDamageMuliplier=0;
        String playerWeapons = null;
        switch (playerWeaponId) {
            case 1:
                playerWeapons = "War Hammer";
                weaponDamage = 70;
                critChance = 5.0;
                missChance = 5;
                critDamageMuliplier = 1.5;
                System.out.println(" After Grabbing the War Hammer you look to the dragon and decide to either fight or run");
                break;
            case 2:
                playerWeapons = "One-Handed Sword";
                weaponDamage = 50;
                critChance = 25.0;
                missChance = 5;
                critDamageMuliplier = 1.5;
                System.out.println(" After Grabbing the One-Handed sword you look to the dragon and decide to either fight or run");
                break;
            case 3:
                playerWeapons = "Bow";
                weaponDamage = 40;
                critChance = 50.0;
                missChance = 30;
                critDamageMuliplier = 2.5;
                System.out.println(" After Grabbing the Bow you look to the dragon and decide to either fight or run");
                break;
            case 4:
                playerWeapons = "Mages Staff";
                weaponDamage = 80;
                critChance = 1.0;
                missChance = 20;
                critDamageMuliplier = 1.0;
                System.out.println(" After Grabbing the Mages Staff you look to the dragon and decide to either fight or run");
                break;
            case 5:
                playerWeapons = "Dagger";
                weaponDamage = 15;
                critChance = 60.0;
                missChance = 10;
                critDamageMuliplier = 6.0;
                System.out.println(" After Grabbing the Dagger you look to the dragon and decide to either fight or run");
                break;
        }

        PlayerWeapons player1Armed = new PlayerWeapons(playerWeapons, weaponDamage, critChance, critDamageMuliplier, missChance, playerName, playerRace, playerHealth, cheesewheel);

        Scanner SceneScanner = new Scanner(System.in);
        System.out.println("type [1]fight or [2]run");
        int choice = SceneScanner.nextInt();
        System.out.println(choice);

        if (choice == 1) {
            System.out.println("You died trying to fight the dragon");
            System.exit(0);
        } else {
            System.out.println("you run into the caves inside the tower");
        }

        //looting part of the story
        System.out.println("You pass some chests and find some CheeseWheels");


        System.out.println("Whilst inside the caves you encounter a brown bear");
        System.out.println("ʕっ• ᴥ • ʔっ");
        Enemy brownbear = new Enemy(500, 20);



        double bear1Damage = brownbear.getDamage();
            // cave fight
            while (brownbear.getHealth() > 0) {

                double critChanceRandomiser = Math.random()*100;
                double critHit = player1Armed.getWeaponDamage() * player1Armed.getCritDamageMuliplier();

                double missChanceRandomiser = Math.random()*100;


                double updatedBearHealth = brownbear.getHealth();
                double updatedPlayerHealth = player1Armed.getHealth();
                System.out.println("Your HP: " + updatedPlayerHealth);
                System.out.println("Enemy HP: " + updatedBearHealth);

                Scanner fightScanner = new Scanner(System.in);
                System.out.println("[1] Attack");
                System.out.println("[2] Cast Healing Spell");
                int battleChoice = fightScanner.nextInt();

                if (battleChoice == 1){
                    if(player1Armed.getMissChance() < missChanceRandomiser){
                    if(critChanceRandomiser < player1Armed.getCritChance()){
                        brownbear.setHealth(updatedBearHealth- critHit);

                        System.out.println("you scored a critical hit");
                        System.out.println("you attacked the bear for " + critHit +" DMG");
                    }else{
                        brownbear.setHealth(updatedBearHealth - player1Armed.getWeaponDamage());
                        System.out.println("you attacked the bear for " + player1Armed.getWeaponDamage()+"DMG");
                    }
                }else {
                        System.out.println("you missed!!");

                    }
                    if(brownbear.getHealth()>0) {
                        player1Armed.setHealth(updatedPlayerHealth- bear1Damage);
                        System.out.println("the bear attacked you for " + bear1Damage +"DMG");
                    }else {
                        System.out.println("you killed the bear");
                    }
                }
                int eatChance = (int) (Math.random()*100);
                if(battleChoice == 2){
                    int playersCheeseWheels = player1Armed.getCheesewheel();
                    if(eatChance > 55) {
                        player1Armed.setCheesewheel(playersCheeseWheels-1);
                        player1Armed.setHealth(updatedPlayerHealth + 70 - bear1Damage);
                        System.out.println("you ate a cheesewheel and healed for 70hp");
                        System.out.println("the bear attacked you for " + bear1Damage + "DMG");
                    }else{
                        player1Armed.setHealth(updatedPlayerHealth- bear1Damage);
                        System.out.println("the bear interrupted your spell and attacked you for " + bear1Damage + "DMG");
                    }
                }


                if(updatedPlayerHealth<=0){
                    System.exit(0);
                    System.out.println("you died");
                }
            }

            System.out.println("you defeated the bear and make it out of the cave ");

    }
}
