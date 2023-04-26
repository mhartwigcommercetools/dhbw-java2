package com.education.mosbach.maths.api;

public class DenominatorNotZeroException extends RuntimeException  {

    @Override
    public String toString() {
        return
                "Ein Bruch darf niemals 0 im Nenner haben. Falls Du das nicht weißt, "
                +
                "empfehlen wir den erneuten Besuch der Grundschule.";
    }
}
