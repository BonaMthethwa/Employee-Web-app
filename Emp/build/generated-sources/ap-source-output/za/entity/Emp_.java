package za.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.entity.Image;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-06-13T08:09:23")
@StaticMetamodel(Emp.class)
public class Emp_ { 

    public static volatile ListAttribute<Emp, Image> imgs;
    public static volatile SingularAttribute<Emp, String> name;
    public static volatile SingularAttribute<Emp, Long> id;

}