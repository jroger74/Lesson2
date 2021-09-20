
    public String processTrafficLightSignal(String color) {

        if (color == "зеленый") {
            return "можно ехать";
        } else if (color == "жёлтый" || color == "красный") {
            return "стой";
        } else {return "перезапросить датчики";

        }

    }
