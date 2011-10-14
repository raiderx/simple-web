package org.karpukhin.simpleweb.search;

import org.karpukhin.simpleweb.model.Entity;

/**
 * @author Pavel Karpukhin
 */
public abstract class SearchCriteria<T extends Entity> {

    private T example;
    private String sortColumn;
    private String sortOrder;
    private int page = 0;

    public T getExample() {
        return example;
    }

    public void setExample(T example) {
        this.example = example;
    }

    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
