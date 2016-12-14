package com.github.baloise.rocketchatrestclient;

import com.github.baloise.rocketchatrestclient.util.HttpMethods;

/**
 * Enumeration of the available REST API methods.
 *
 * @author Bradley Hilton (graywolf336)
 * @since 0.1.0
 * @version 0.0.1
 */
public enum RocketChatRestApiV1 {
    /** Retrieves a <strong>public</strong> channel's information. */
    ChannelsInfo("channels.info", HttpMethods.GET, true),
    /** Retrieves a list of all the <strong>public</strong> channels. */
    ChannelsList("channels.list", HttpMethods.GET, true),
    /** Creates a new <strong>public</strong> channel. */
    ChannelsCreate("channels.create", HttpMethods.POST, true),
    /** Deletes a chat message. */
    ChatDelete("chat.delete", HttpMethods.POST, true),
    /** Sends a new chat message */
    ChatPostMessage("chat.postMessage", HttpMethods.POST, true),
    /** Retrieves information about a <strong>private</strong> group, but only if the user is part of it. */
    GroupsInfo("groups.info", HttpMethods.GET, true),
    /** Retrieves a list of all the <strong>private</strong> groups the auth'd user has joined. */
    GroupsList("groups.list", HttpMethods.GET, true),
    /** Retrieves a list of all the direct message rooms the auth'd user has. */
    ImsList("ims.list", HttpMethods.GET, true),
    /** Gets the information about the server, including version and build commit. */
    Info("info", HttpMethods.GET, false),
    /** Retrieves the user information from the server. */
    UsersInfo("users.info", HttpMethods.GET, true),
    /** Retrieves a list of all the users in the server. */
    UsersList("users.list", HttpMethods.GET, true);

    private String methodName;
    private HttpMethods httpMethod;
    private boolean requiresAuth;

    private RocketChatRestApiV1(String methodName, HttpMethods httpMethod, boolean requiresAuth) {
        this.methodName = methodName;
        this.httpMethod = httpMethod;
        this.requiresAuth = requiresAuth;
    }

    /**
     * Gets the method name to be called to the server.
     *
     * @return the method name plus "v1/" at the start
     */
    public String getMethodName() {
        return "v1/" + this.methodName;
    }

    /**
     * Gets the {@link HttpMethods http method} which should be used.
     *
     * @return {@link HttpMethods http method} to be used
     */
    public HttpMethods getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * Check whether the method requires authentication or not.
     *
     * @return whether this requires authentication or not
     */
    public boolean requiresAuth() {
        return this.requiresAuth;
    }
}