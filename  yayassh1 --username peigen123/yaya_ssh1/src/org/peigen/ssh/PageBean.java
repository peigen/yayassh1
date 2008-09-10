package org.peigen.ssh;

/**
 *                       
 *Filename:PageBean.java
 *
 *Description:
 *
 *Version:0.1
 *
 *Author: peigen
 *
 *Email: peigen_peigen@163.com
 *
 *Blog: http://blog.163.com/peigen_peigen
 *
 *       
 *History:
 *      [ Author             Date       Version     Content ]
 *        peigen        2008-09-02     0.1        create
 *
 */
public class PageBean {
	private int count = 0; 			// 记录总数

    private int pageCount = 0;		// 总页数

    private int page = 1; 			// 当前页数

    public int getCount() {
        return count;
    }

    public void setCount(int count, int pageSize) {
        if (pageSize != 0) {
            pageCount = count / pageSize;
            if (count % pageSize != 0) {
                pageCount++;
            }
        }
        this.count = count;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
