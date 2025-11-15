void main() {
    Mouse mouse1 = new Mouse(
            "Razer",
            "Cobra",
            "Sensor1",
            8500,
            6,
            false,
            77.0
    );

    Mouse mouse2 = new Mouse(
            "Logitech",
            "G Pro X Superlight",
            "HERO 25K",
            25600,
            5,
            true,
            63.0
    );

    Mouse mouse3 = new Mouse(
            "SteelSeries",
            "Rival 3",
            "TrueMove Core",
            8500,
            6,
            false,
            77.0
    );

    Mouse mouse4 = new Mouse(
            "Corsair",
            "Dark Core RGB Pro",
            "PixArt PMW3392",
            18000,
            8,
            true,
            142.0
    );

    Mouse mouse5 = new Mouse(
            "Razer",
            "DeathAdder V3",
            "Focus Pro 30K",
            30000,
            5,
            false,
            59.0
    );

    System.out.println("1. " + mouse1);
    System.out.println("2. " + mouse2);
    System.out.println("3. " + mouse3);
    System.out.println("4. " + mouse4);
    System.out.println("5. " + mouse5);

    System.out.println(mouse2.getDetails());

    Mouse[] allMice = {mouse1, mouse2, mouse3, mouse4, mouse5};

    for (Mouse mouse : allMice) {
        if (mouse.isWireless()) {
            System.out.println("- " + mouse + " (" + mouse.getWeight() + "g)");
        }
    }

    Mouse lightestMouse = allMice[0];
    for (Mouse mouse : allMice) {
        if (mouse.getWeight() < lightestMouse.getWeight()) {
            lightestMouse = mouse;
        }
    }

    System.out.println(lightestMouse + " - " + lightestMouse.getWeight() + "g");
}
