public class MoneyExchange {

    int rielVSdollar = 4000;
    int rielVSbaht   = 3/400;
    int dollarVSbaht = 30;

    //Method to change from riel to dollar
    public float riel2Dollar(float riel) {
        float riel2Dollar = riel/rielVSdollar;
        return riel2Dollar;
    }

    //Method to change from riel to baht
    public float riel2Baht(float riel) {
        float riel2Baht = riel*rielVSbaht;
        return riel2Baht;
    }

    //Method to change from dollar to riel
    public float dollar2Riel(float dollar) {
        float dollar2Riel = dollar*rielVSdollar;
        return dollar2Riel;
    }

    //Method to change from dollar to baht
    public float dollar2Baht(float dollar) {
        float dollar2Baht = dollar*dollarVSbaht;
        return dollar2Baht;
    }

    //Method to change from baht to riel
    public float baht2Riel(float baht) {
        float baht2Riel = baht/rielVSbaht;
        return baht2Riel;
    }
}