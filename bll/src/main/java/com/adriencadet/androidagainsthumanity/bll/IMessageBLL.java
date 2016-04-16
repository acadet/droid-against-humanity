package com.adriencadet.androidagainsthumanity.bll;

import com.adriencadet.androidagainsthumanity.beans.Conversation;
import com.adriencadet.androidagainsthumanity.beans.Message;

import java.util.List;

import rx.Observable;

/**
 * IMessageBLL
 * <p>
 */
public interface IMessageBLL {
    Observable<List<Message>> sortByDateAsc(Conversation conversation);

    Observable<Void> post(Conversation conversation, String content);
}
