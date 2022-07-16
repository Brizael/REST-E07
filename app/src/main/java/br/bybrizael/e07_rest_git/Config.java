package br.bybrizael.e07_rest_git;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Config {

    private final Retrofit retrofit;

    public Config() {

        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public GitHubService getGitHubService() {
        return this.retrofit.create(GitHubService.class);
    }


}
