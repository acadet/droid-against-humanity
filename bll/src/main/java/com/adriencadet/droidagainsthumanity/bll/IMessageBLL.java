package com.adriencadet.droidagainsthumanity.bll;

import com.adriencadet.droidagainsthumanity.beans.Conversation;
import com.adriencadet.droidagainsthumanity.beans.Message;

import org.javatuples.Pair;

import java.util.List;

import rx.Observable;

/**
 * IMessageBLL
 * <p>
 */
public interface IMessageBLL {
    Observable<Pair<List<String>, List<String>>> listSuggestions();

    Observable<List<Message>> sortByDateAsc(Conversation conversation);

    Observable<List<Message>> sortByDateAsc(String slug);

    void post(Conversation conversation, String prefix, String suffix);

    void post(String slug, String prefix, String suffix);
}
