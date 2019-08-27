package io.bihero.world;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.web.api.OperationResponse;

public class DefaultWorldService implements WorldService {

    public void getWorldWord(OperationRequest context, Handler<AsyncResult<OperationResponse>> resultHandler) {
        resultHandler.handle(Future.succeededFuture(OperationResponse.completedWithPlainText(Buffer.buffer("World"))));
    }

}