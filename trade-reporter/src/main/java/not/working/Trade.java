package not.working;



import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
class Trade extends PanacheEntity {

    @Column(length = 40, unique = true)
    String name;
}