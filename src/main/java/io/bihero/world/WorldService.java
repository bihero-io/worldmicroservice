package io.bihero.world;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.web.api.OperationResponse;
import io.vertx.ext.web.api.generator.WebApiServiceGen;

@WebApiServiceGen
public interface WorldService {

    static WorldService create(Vertx vertx) {
        return new DefaultWorldService(vertx);
    }

    void getWorldWord(OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

    void getDoc(OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler);

}
