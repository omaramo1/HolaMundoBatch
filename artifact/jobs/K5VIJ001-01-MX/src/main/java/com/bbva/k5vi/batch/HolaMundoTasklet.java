package com.bbva.k5vi.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HolaMundoTasklet implements Tasklet {
    private static final Logger LOGGER = LoggerFactory.getLogger(HolaMundoTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        LOGGER.info("Agregando otra configuracion");
        return RepeatStatus.FINISHED;
    }
}