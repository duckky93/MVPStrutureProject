package com.android.kyler.baseproject.Entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by kyler on 01/09/2017.
 */

public class ExampleGithubProperty implements Serializable {

    @SerializedName("login") String login;

    @SerializedName("id") Long id;

    @SerializedName("avatar_url") String avatarUrl;

    @SerializedName("gravatar_id") String gravatarId;

    @SerializedName("url") String url;

    @SerializedName("html_url") String htmlUrl;

    @SerializedName("followers_url") String followersUrl;

    @SerializedName("following_url") String followingUrl;

    @SerializedName("gists_url") String gistsUrl;

    @SerializedName("starred_url") String starredUrl;

    @SerializedName("subscriptions_url") String subscriptionsUrl;

    @SerializedName("organizations_url") String organizationsUrl;

    @SerializedName("repos_url") String reposUrl;

    @SerializedName("events_url") String eventsUrl;

    @SerializedName("received_events_url") String receivedEventsUrl;

    @SerializedName("type") String type;

    @SerializedName("site_admin") Boolean siteAdmin;

    @SerializedName("name") String name;

    @SerializedName("company") String company;

    @SerializedName("blog") String blog;

    @SerializedName("location") String location;

    @SerializedName("email") String email;

    @SerializedName("hireable") String hireable;

    @SerializedName("bio") String bio;

    @SerializedName("public_repos") String publicRepos;

    @SerializedName("public_gists") String publicGists;

    @SerializedName("followers") String followers;

    @SerializedName("following") String following;

    @SerializedName("created_at") String createdAt;

    @SerializedName("updated_at") String updatedAt;

    public String getLogin() {
        return login;
    }

    public Long getId() {
        return id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getBlog() {
        return blog;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getHireable() {
        return hireable;
    }

    public String getBio() {
        return bio;
    }

    public String getPublicRepos() {
        return publicRepos;
    }

    public String getPublicGists() {
        return publicGists;
    }

    public String getFollowers() {
        return followers;
    }

    public String getFollowing() {
        return following;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
