package gtrrzvictor.neo4j.concept.dao.node;

import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * Created by victor on 10/10/14.
 */
@NodeEntity
public class Entity {

    private String type, name, imsi, mac;
}
