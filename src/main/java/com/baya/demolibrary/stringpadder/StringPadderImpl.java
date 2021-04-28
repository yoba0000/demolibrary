package com.baya.demolibrary.stringpadder;

class StringPadderImpl implements StringPadder {

    public StringPadderImpl() {
    }

    @Override
    public String padLeft(String stringToPad, int totallength) {
        return padLeft(stringToPad, totallength, ' ');
    }

    @Override
    public String padLeft(String stringToPad, int totalLength, char paddingCharacter) {
        return getStringToBeAdded(stringToPad, totalLength, paddingCharacter) + stringToPad;
    }

    @Override
    public String padRight(String stringToPad, int totalLength) {
        return padRight(stringToPad, totalLength, ' ');
    }

    @Override
    public String padRight(String stringToPad, int totalLength, char paddingCharacter) {
        return stringToPad + getStringToBeAdded(stringToPad, totalLength, paddingCharacter);
    }

    private String getStringToBeAdded(String stringToPad, int totalLength, char paddingCharacter) {
        int quantity = totalLength - stringToPad.length();
        if (quantity > 0) {
            return Character.toString(paddingCharacter).repeat(quantity);

        } else {

            return "";

        }

    }

}
