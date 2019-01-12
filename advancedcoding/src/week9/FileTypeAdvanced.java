package week9;

public enum FileTypeAdvanced {

    TXT("txt"),
    DOC("doc"),
    PTX("ptx"),
    IML("iml");

    String value;

    FileTypeAdvanced(String enumValue) {
        value = enumValue;
    }

    public String getValue() {
        return value;
    }

}
