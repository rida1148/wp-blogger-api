/*
 * Copyright 2015 padicao.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.edu.hust.xie.blogclient.blogger;

import cn.edu.hust.xie.blogclient.BlogCore;
import cn.edu.hust.xie.blogclient.XMLTags;
import cn.edu.hust.xie.blogclient.RequestParam;
import cn.edu.hust.xie.blogclient.Response;
import cn.edu.hust.xie.blogclient.Request;

/**
 *
 * @author padicao
 */
public class GetPostRequest extends Request {
    private static final String METHOD_NAME = "blogger.getPost";
    
    public GetPostRequest(BlogCore c, int post) {
        super(METHOD_NAME);
        params = new RequestParam[4];
        params[0] = c.getAppKey();
        params[1] = new RequestParam(XMLTags.I4, String.format("%d", post));
        params[2] = c.getUserName();
        params[3] = c.getPassWord();
    }

    @Override
    public Response getResponseInstance() {
        return new GetPostResponse();
    }
    
}
