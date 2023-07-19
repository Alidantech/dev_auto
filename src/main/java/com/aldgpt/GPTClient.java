package com.aldgpt;

import java.io.IOException;
import com.aldgpt.utils.HttpUtil;

public class GPTClient {

      static String link = "https://api.openai.com/v1/engines/text-davinci-003/completions";
      static String api  = "";
      private static final String CHATGPT_API_ENDPOINT = link;
      private static final String API_KEY = api;

      public static String getChatGptResponse(String prompt) throws IOException {
            String requestBody = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 100}";
            return HttpUtil.postRequest(CHATGPT_API_ENDPOINT, API_KEY, requestBody);
      }
}
    