package io.onedev.server.model.support.pullrequest.changedata;

import javax.annotation.Nullable;

import org.apache.wicket.Component;

import io.onedev.server.model.PullRequestChange;
import io.onedev.server.util.CommentSupport;

public class PullRequestMergeData implements PullRequestChangeData {

	private static final long serialVersionUID = 1L;

	private final String reason;
	
	public PullRequestMergeData(@Nullable String reason) {
		this.reason = reason;
	}
	
	@Override
	public String getDescription() {
		if (reason != null)
			return reason;
		else
			return "merged pull request";
	}

	@Override
	public Component render(String componentId, PullRequestChange change) {
		return null;
	}

	@Override
	public CommentSupport getCommentSupport() {
		return null;
	}

}
