package enums;

import lombok.Getter;

/**
 * @Author: 夏企博
 * @Date: 2025/9/12
 * @Version: 1.0
 */
@Getter
public enum ExpressStatus {
    CREATED("已揽收"),TRANSIT("在途中"),SUCCESS("签收");

    private final String label;

    ExpressStatus(String label){
        this.label=label;
    }

    public String getLabel(){
        return label;
    }
}
