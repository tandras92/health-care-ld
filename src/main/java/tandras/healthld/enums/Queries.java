package tandras.healthld.enums;

public enum Queries {

    DEFAULT_QUERY("""
            SELECT *
            FROM `hospital`
            ORDER BY `id` ASC
            LIMIT 200""");

    public final String query;

    Queries(String query) {
        this.query = query;
    }
}
