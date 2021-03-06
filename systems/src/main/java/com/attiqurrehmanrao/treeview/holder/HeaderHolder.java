package com.attiqurrehmanrao.treeview.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.attiqurrehmanrao.treeview.R;
import com.attiqurrehmanrao.treeview.model.TreeNode;
import com.github.johnkil.print.PrintView;

/**
 * Created by Attiq ur Rehman on 06/06/16
 */
public class HeaderHolder extends TreeNode.BaseNodeViewHolder<IconTreeItemHolder.IconTreeItem> {

    private PrintView arrowView;

    public HeaderHolder(Context context) {
        super(context);
    }

    @Override
    public View createNodeView(TreeNode node, IconTreeItemHolder.IconTreeItem value) {
        final LayoutInflater inflater = LayoutInflater.from(context);
        final View view = inflater.inflate(R.layout.layout_header_node, null, false);
        TextView tvValue = (TextView) view.findViewById(R.id.node_value);
        tvValue.setText(value.text);

        final PrintView iconView = (PrintView) view.findViewById(R.id.icon);
        iconView.setIconText(context.getResources().getString(value.icon));

        arrowView = (PrintView) view.findViewById(R.id.arrow_icon);
        if (node.isLeaf()) {
            arrowView.setVisibility(View.INVISIBLE);
        }

        return view;
    }

    @Override
    public void toggle(boolean active) {
        arrowView.setIconText(context.getResources().getString(active ? R.string.ic_keyboard_arrow_down : R.string.ic_keyboard_arrow_right));
    }


}
