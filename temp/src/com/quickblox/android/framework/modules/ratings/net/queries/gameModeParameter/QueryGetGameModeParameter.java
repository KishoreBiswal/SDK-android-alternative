package com.quickblox.android.framework.modules.ratings.net.queries.gameModeParameter;

import com.quickblox.android.framework.base.definitions.RestMethod;
import com.quickblox.android.framework.base.net.rest.RestRequest;
import com.quickblox.android.framework.modules.ratings.definitions.Consts;
import com.quickblox.android.framework.modules.ratings.models.QBGameModeParameter;
import com.quickblox.android.framework.modules.ratings.net.results.QBGameModeParameterResult;

/**
 * User: Andriy Dmitrenko
 * Date: 23.08.12
 * Time: 9:53
 */
public class QueryGetGameModeParameter extends QueryBaseGameModeParameter {

    public QueryGetGameModeParameter(QBGameModeParameter gameModeParameter) {
        super(gameModeParameter);
    }

    @Override
    protected void setMethod(RestRequest request) {
        request.setMethod(RestMethod.GET);
    }

    @Override
    public String getUrl() {
        return buildQueryUrl(Consts.GAME_MODE_PARAMETERS_ENDPOINT, gameModeParameter.getId());
    }

    @Override
    public Class getResultClass() {
        return QBGameModeParameterResult.class;
    }
}