package tandras.healthld.service;

import org.eclipse.rdf4j.model.util.ModelBuilder;
import tandras.healthld.util.UrlUtil;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static tandras.healthld.enums.Queries.DEFAULT_QUERY;

@Service
public class PriceTransparencyService {

    public String processQuery(String query) {
        return Optional.ofNullable(query)
                .map(UrlUtil::encodeUrl)
                .orElse(UrlUtil.encodeUrl(DEFAULT_QUERY.query));
    }

    public ModelBuilder buildGraphDBModel() {
        return null;
    }
}
