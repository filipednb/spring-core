package studying.spring.core.java.annotation.autowired.multi.locations.I;

public class Artist {

    private Instrument instrument;

    public Artist(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "instrument=" + instrument +
                '}';
    }
}
