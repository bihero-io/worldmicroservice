package io.bihero.world;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.web.api.OperationResponse;

public class DefaultWorldService implements WorldService {

    private final Vertx vertx;

    public DefaultWorldService(Vertx vertx) {
        this.vertx = vertx;
    }

    public void getWorldWord(OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler) {
        resultHandler.handle(Future.succeededFuture(OperationResponse.completedWithPlainText(Buffer.buffer("World"))));
    }

    @Override
    public void getDoc(OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler) {
        vertx.fileSystem().readFile("doc.yaml", buffResult ->
                resultHandler.handle(Future.succeededFuture(
                        OperationResponse.completedWithPlainText(buffResult.result()))
                ));
    }

}