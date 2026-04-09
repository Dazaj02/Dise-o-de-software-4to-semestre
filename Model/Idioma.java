package Model;

public enum Idioma {
    ESPAÑOL, INGLES, PORTUGUES {
        @Override
        public String toString() {
            return "Portugués";
        }
    }
}