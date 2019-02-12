package hiscoxusa.oneshield.model;

public enum UI_HostEnvironments {
    DEV("https://hiscdev.oneshield.com")
    ,  PVT("https://hiscpvt-oneshield-web-northeurope.azure.hiscox.com")
    ,  PVT_CLOUD("https://hiscpvt.cloud.hiscox.com")
    ,  BASEQA2("https://baseqa2.oneshield.com")
    , OSQA("https://osqa-oneshield-web-northeurope.azure.hiscox.com")
    , ENV(" ");
    private String uiHostName;

    UI_HostEnvironments(String uiHostName) {
        this.uiHostName = uiHostName;
    }

    @Override
    public String toString() {
        return uiHostName;
    }

    public String getUiHostName() {
      String env = System.getProperty("SUT").toUpperCase();
        switch (env) {
            case "OSQA":
                return OSQA.toString();
            case "PVT":
                return PVT.toString();
        }
        return this.uiHostName;
    }
}