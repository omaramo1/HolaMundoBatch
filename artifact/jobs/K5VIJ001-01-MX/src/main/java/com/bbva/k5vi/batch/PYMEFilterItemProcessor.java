package com.bbva.k5vi.batch;

import org.springframework.batch.item.ItemProcessor;
public class PYMEFilterItemProcessor implements ItemProcessor<CapacityRecord, CapacityRecord> {

    @Override
    public CapacityRecord process(CapacityRecord capacityRecord) throws Exception {
        if("PY".equals(capacityRecord.getTaxpayer_type())){
            return capacityRecord;
        }else{
            return null;
        }
    }
}
