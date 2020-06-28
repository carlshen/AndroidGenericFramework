package com.tanjiajun.androidgenericframework.data

import com.tanjiajun.androidgenericframework.data.model.repository.RepositoryData
import com.tanjiajun.androidgenericframework.data.model.user.response.UserAccessTokenData
import com.tanjiajun.androidgenericframework.data.model.user.response.UserInfoData
import com.tanjiajun.androidgenericframework.utils.Language

/**
 * Created by carl shen on 2020/5/28.
 */
val userAccessTokenDataJson = "{\n" +
        "\"id\": 3993892,\n" +
        "\"token\": \"\",\n" +
        "\"url\": \"https://api.github.com/authorizations/3993892\"\n" +
        "}"

val userInfoDataJson = "{\n" +
        "\"avatar_url\": \"https://avatars1.githubusercontent.com/u/25838119?v=4\",\n" +
        "\"blog\": \"\",\n" +
        "\"collaborators\": 0,\n" +
        "\"created_at\": \"2017-02-17T06:28:25Z\",\n" +
        "\"disk_usage\": 46380,\n" +
        "\"email\": \"1120571286@qq.com\",\n" +
        "\"events_url\": \"https://api.github.com/users/carlshen/events{/privacy}\",\n" +
        "\"followers\": 15,\n" +
        "\"followers_url\": \"https://api.github.com/users/carlshen/followers\",\n" +
        "\"following\": 5,\n" +
        "\"following_url\": \"https://api.github.com/users/carlshen/following{/other_user}\",\n" +
        "\"gists_url\": \"https://api.github.com/users/carlshen/gists{/gist_id}\",\n" +
        "\"gravatar_id\": \"\",\n" +
        "\"html_url\": \"https://github.com/carlshen\",\n" +
        "\"id\": 25838119,\n" +
        "\"location\": \"中国广东省广州市\",\n" +
        "\"login\": \"carlshen\",\n" +
        "\"name\": \"TanJiaJun\",\n" +
        "\"node_id\": \"MDQ6VXNlcjI1ODM4MTE5\",\n" +
        "\"organizations_url\": \"https://api.github.com/users/carlshen/orgs\",\n" +
        "\"owned_private_repos\": 0,\n" +
        "\"private_gists\": 0,\n" +
        "\"public_gists\": 0,\n" +
        "\"public_repos\": 11,\n" +
        "\"received_events_url\": \"https://api.github.com/users/carlshen/received_events\",\n" +
        "\"repos_url\": \"https://api.github.com/users/carlshen/repos\",\n" +
        "\"site_admin\": \"false\",\n" +
        "\"starred_url\": \"https://api.github.com/users/carlshen/starred{/owner}{/repo}\",\n" +
        "\"subscriptions_url\": \"https://api.github.com/users/carlshen/subscriptions\",\n" +
        "\"total_private_repos\": 0,\n" +
        "\"two_factor_authentication\": false,\n" +
        "\"type\": \"User\",\n" +
        "\"updated_at\": \"2020-05-26T07:19:39Z\",\n" +
        "\"url\": \"https://api.github.com/users/carlshen\"\n" +
        "}"

val repositoryDataJson = "{\n" +
        "\"total_count\": 1,\n" +
        "\"incomplete_results\": false,\n" +
        "\"items\": [\n" +
        "{\n" +
        "\"id\": 0,\n" +
        "\"name\": \"谭嘉俊\",\n" +
        "\"description\": \"描述\",\n" +
        "\"language\": \"Kotlin\",\n" +
        "\"starCount\": 0,\n" +
        "\"forkCount\": 0\n" +
        "}\n" +
        "]\n" +
        "}"

val userAccessTokenData = UserAccessTokenData(
        id = 3993892,
        token = "",
        url = "https://api.github.com/authorizations/3993892"
)

val userInfoData = UserInfoData(
        id = 25838119,
        login = "carlshen",
        nodeId = "MDQ6VXNlcjM5OTM4OTI=",
        avatarUrl = "https://avatars1.githubusercontent.com/u/25838119?v=4",
        gravatarId = "",
        url = "https://api.github.com/users/carlshen",
        htmlUrl = "https://github.com/carlshen",
        followersUrl = "https://api.github.com/users/carlshen/followers",
        followingUrl = "https://api.github.com/users/carlshen/following{/other_user}",
        gistsUrl = "https://api.github.com/users/carlshen/gists{/gist_id}",
        starredUrl = "https://api.github.com/users/carlshen/starred{/owner}{/repo}",
        subscriptionsUrl = "https://api.github.com/users/carlshen/subscriptions",
        organizationsUrl = "https://api.github.com/users/carlshen/orgs",
        reposUrl = "https://api.github.com/users/carlshen/repos",
        eventsUrl = "https://api.github.com/users/carlshen/events{/privacy}",
        receivedEventsUrl = "https://api.github.com/users/carlshen/received_events",
        type = "User",
        siteAdmin = false,
        name = "Shen carl",
        company = "",
        blog = "",
        location = "中国北京市",
        email = "2926711810@qq.com",
        hireable = "",
        bio = "",
        publicRepos = 11,
        publicGists = 0,
        followers = 15,
        following = 5,
        createdAt = "2017-02-17T06:28:25Z",
        updatedAt = "2020-05-26T07:19:39Z",
        privateGists = 0,
        totalPrivateRepos = 0,
        ownedPrivateRepos = 0,
        diskUsage = 46380,
        collaborators = 0,
        twoFactorAuthentication = false
)

val repositoryData = RepositoryData(
        id = 0,
        name = "shen carl",
        description = "描述",
        language = Language.KOTLIN,
        starCount = 0,
        forkCount = 0
)